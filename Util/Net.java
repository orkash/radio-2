package Util;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

/**
 *
 * @author 
 */
public class Net {
    public static String get(String url, String charset){
        StringBuilder htmstr = new StringBuilder();

        try {
            URLConnection uc = new URL(url).openConnection();
            BufferedInputStream bis = new BufferedInputStream(uc.getInputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(bis, charset));

            String line;
            while ((line = br.readLine()) != null) {
                htmstr.append(line + "\n");
            }
        }catch(UnsupportedEncodingException ex){
        } catch (MalformedURLException ex) {
        } catch (UnknownHostException ex) {
        } catch (IOException ex) {
        }
        return htmstr.toString();
    }
}
