package Utilitie;

import java.io.*;

public class Records {

    public static void save(Object serializable, String file) {

        try {
            FileOutputStream fOut = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fOut);
            out.writeObject(serializable);
            out.flush();
            out.close();
            fOut.close();
        } catch (Exception e) {
            System.out.println("IOException is caught");
        }
    }

    public static Object load(String file) {
        try {
            Object s = null;
            File file1 = new File(file);
            if (file1.exists()) {
                FileInputStream file2 = new FileInputStream(file1);
                ObjectInputStream in = new ObjectInputStream(file2);
                s = in.readObject();
                in.close();
                file2.close();
            }
            return s;
        } catch (Exception e) {
            System.out.println("IOException is caught");
        }
        return null;
    }
}
