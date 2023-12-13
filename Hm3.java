// 請實作一個需要有finally區塊的範例？並說明為什麼。
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Hm3 {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("example.txt"));
            String line = reader.readLine();
            System.out.println("Read from file: " + line);
        }
        catch (IOException e)
        {
            System.err.println("IOException: " + e.getMessage());
        }
        finally
        {
            try
            {
                if (reader != null)
                {
                    reader.close(); // 確保文件關閉
                }
            }
            catch (IOException e)
            {
                System.err.println("Error closing BufferedReader: " + e.getMessage());
            }
        }
    }
}
