package myFirstHttpProgram;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thoughtworks.xstream.XStream;
import myFirstHttpProgram.dto.ValCurs;
import myFirstHttpProgram.dto.Valute;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpResponse;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.net.http.HttpClient;

public class Main {

    public static void main(String[] args) throws Exception {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet request = new HttpGet(PropertyReader.getProperty("bnmUrl"));

        ClassicHttpResponse response = client.execute(request);
        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

        String fullresponse = "";
        String line = "";

        while ((line = rd.readLine()) != null) {
            fullresponse += line + "\r\n";
        }
//        System.out.println(line);
        XStream xStream = new XStream();
        xStream.processAnnotations(ValCurs.class);
        xStream.processAnnotations(Valute.class);

        xStream.addImplicitCollection(ValCurs.class, "valutes", Valute.class);
        ValCurs valCurs = (ValCurs) xStream.fromXML(fullresponse);

        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(objectMapper.writeValueAsString(valCurs));

        System.out.println(xStream.toXML(valCurs));

        for (Valute valute : valCurs.getValutes()){
            System.out.println(valute.getName());
        }

    }


}

