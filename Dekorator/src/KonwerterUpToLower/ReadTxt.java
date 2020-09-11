package KonwerterUpToLower;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by PZON_SM on 24.06.2020.
 **/
public class ReadTxt {
    public static void main(String[] args) throws IOException{
        int c;
        try {
            InputStream in = new InputTxt(new BufferedInputStream(new FileInputStream("Text.txt")));

            while ((c = in.read())>=0){
                System.out.print((char)c);
            }

            in.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
