package com.bit68.marketapp.util;

import android.os.AsyncTask;

import com.bit68.marketapp.core.Config;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

class InternetCheck extends AsyncTask<Void,Void,Boolean> {

    private Consumer mConsumer;
    public  interface Consumer { void accept(Boolean internet); }

    public  InternetCheck(Consumer consumer) { mConsumer = consumer; execute(); }

    @Override protected Boolean doInBackground(Void... voids) { try {
        Socket sock = new Socket();
        sock.connect(new InetSocketAddress(Config.GOOGLE_HOST, Config.GOOGLE_PORT), 1500);
        sock.close();
        return true;
    } catch (IOException e) { return false; } }

    @Override protected void onPostExecute(Boolean internet) { mConsumer.accept(internet); }
}

///////////////////////////////////////////////////////////////////////////////////
// Usage

//    new InternetCheck(internet -> { /* do something with boolean response */ });