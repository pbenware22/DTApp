package com.benware.dtapp.network;

import org.simpleframework.xml.convert.AnnotationStrategy;
import org.simpleframework.xml.core.Persister;

import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.internal.JavaNetCookieJar;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class RetrofitClient {
    private static int CONNECTION_TIMEOUT_MIN = 1;
    private static int WRITE_TIMEOUT_MIN = 1;
    private static int READ_TIMEOUT_MIN = 1;

    private static Retrofit retrofit = null;

    public static Retrofit getClient(String baseUrl) {
        if (retrofit == null) {

            // setup cookie manager "just in case"
            CookieManager cookieManager = new CookieManager();
            cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);

            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder()
                    .connectTimeout(CONNECTION_TIMEOUT_MIN, TimeUnit.MINUTES)
                    .writeTimeout(WRITE_TIMEOUT_MIN, TimeUnit.MINUTES)
                    .readTimeout(READ_TIMEOUT_MIN, TimeUnit.MINUTES)
                    .cookieJar(new JavaNetCookieJar(cookieManager));

            okHttpClient.addInterceptor(logging);

            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(SimpleXmlConverterFactory.createNonStrict(
                            new Persister(new AnnotationStrategy())
                    ))
                    .client(okHttpClient.build())
                    .build();
        }
        return retrofit;
    }
}
