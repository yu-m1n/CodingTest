package JAVA;

import java.io.*;
import java.util.StringTokenizer;

public class java27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        char[] ch = st.nextToken().toCharArray();

        st = new StringTokenizer(br.readLine()," ");
        int i = Integer.parseInt(st.nextToken());

        System.out.println(ch[i-1]);

        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();

        int i = Integer.parseInt(br.readLine());

        String[] arr = new String[1000];
        arr = S.split(" ");

        //System.out.println(arr[i-1]);
        bw.write(arr[i - 1]);

        br.close();
        bw.flush();
        bw.close();
        */
    }
}