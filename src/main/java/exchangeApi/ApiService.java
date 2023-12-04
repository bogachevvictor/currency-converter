package exchangeApi;

import com.google.gson.JsonElement;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    @Headers({"Accept: application/json",
    "X-Api-Key: KSe/KRPVUkVt9tPmKEO9kA==ypmDXSI5CcjgUZ8l"})
    @GET("/v1/convertcurrency")
    Call<Response> getResult(
            @Query("have") String originCurrency,
            @Query("want") String targetCurrency,
            @Query("amount") double amount
    );

}
