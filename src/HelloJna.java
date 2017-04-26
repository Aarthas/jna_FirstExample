import com.sun.jna.Library;
import com.sun.jna.Native;

public interface HelloJna extends Library {

        //加载libhello.so链接库
        HelloJna INSTANTCE = (HelloJna) Native.loadLibrary("/Users/zhangyn/weexPro/jna_FirstExample/src/libhello.so", HelloJna.class);

        //此方法为链接库中的方法
        void test();
        int add(int a, int b);



}  