import com.google.gson.Gson;
import com.google.gson.JsonElement;
import exchangeApi.ApiService;
import exchangeApi.Response;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInput getInput = new UserInput();
        double amount = getInput.getAmount();
        String originCurrency = getInput.getOriginCurrency();
        String targetCurrency = getInput.getTargetCurrency();

        final String BASE_URL = "https://api.api-ninjas.com";
        Gson gson = new Gson();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
               .addConverterFactory(GsonConverterFactory.create())
               .build();

        ApiService service = retrofit.create(ApiService.class);

        Call<Response> call = service.getResult(originCurrency, targetCurrency, amount);

       try {
           String bodyResponce = gson.toJson(call.execute().body());
           Response response = gson.fromJson(bodyResponce, Response.class);
           double count = response.getResult();
           System.out.println("Result: " + count);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
}
}





