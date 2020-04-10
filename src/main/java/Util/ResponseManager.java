/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author manuel
 */
public class ResponseManager {

    private ExecutorService executor;

    public ResponseManager(int threads) {
        this.executor = Executors.newFixedThreadPool(threads);
    }
    

    public Future<Response> request(int _id, String _url) throws Exception {
        return executor.submit(() -> {
            StringBuilder _response = new StringBuilder();
            URL url = new URL(_url);
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");
            BufferedReader rd = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                _response.append(line);
            }
            rd.close();
            return new Response(_id, _url, _response.toString());
        });
    }

}
