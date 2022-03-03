import com.google.cloud.compute.v1.Metadata;

public class Main {
    public static void main(String[] args) {
        System.out.println(Metadata.getDefaultInstance().getAllFields());
    }
}
