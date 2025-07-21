import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;



public class Busqueda {

public double busqueda1(String direccion)throws IOException, InterruptedException{
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(direccion))
            .build();
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    //System.out.println(response.body());
    String json = response.body();
    Gson gson = new Gson();
    Moneda mimoneda= gson.fromJson(json,Moneda.class);
    //System.out.println(mimoneda.getTaza());


    return mimoneda.getTaza();
}
}
