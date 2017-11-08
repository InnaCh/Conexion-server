/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.helper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.daw.connection.BoneCPImpl;
import net.daw.connection.ConnectionInterface;
import net.daw.connection.HikariCPImpl;

/**
 *
 * @author Inna
 */
public class AppConfigurationHelper {
     public static int getJsonMsgDepth() {
        return 1;
    }

    public static ConnectionInterface getSourceConnection() throws Exception {
        ConnectionInterface oDataConnectionSource = new HikariCPImpl();
        return oDataConnectionSource;
    }

    public static Gson getGson() throws Exception {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setDateFormat("dd/MM/yyyy");
       // gsonBuilder.setDateFormat("dd/MM/yyyy HH:mm");
        Gson oGson = gsonBuilder.excludeFieldsWithoutExposeAnnotation().create();
        return oGson;
    }
}

