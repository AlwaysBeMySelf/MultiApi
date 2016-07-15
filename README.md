# MultiApi
利用productFlavors 打包不同版本API的调用
对于测试版和正式版等有多个版本的app，每次打包需要替换不同的api地址。可以使用productFlavors 打包不同版本API的调用。

1.在 src 目录下新建几个自己需要打包对应名称的包，比如我要打包如下两个版本, myrelease和mydebug，新建各自java文件夹，可以直接复制main文件下的java包到各个新建目录下，然后只新建和声明自己需要类和对应常量（需一致）。
![image](https://github.com/AlwaysBeMySelf/MultiApi/raw/master/picture/multi.png)

myrelease的GlobalVar中
public static String dateIp="http://www.baidu.com";

mydebug的GlobalVar中
public static String dateIp="http://www.google.com";

2.在主程序main需要的地方调用对应的常量，实际开发中是调用api去请求数据
![image](https://github.com/AlwaysBeMySelf/MultiApi/raw/master/picture/multi2.png)

在代码中调用的是当前选择对应的productFlavors版本的代码，比如当前选择的是myrelease版,其他版本会显示下面好像报错的红圈，编译正常，当我们打包成功后，它会调用对应目录下面常量

3. 签名打包，配置gradle文件，在相应打包程序的module中的build.gradle里面做如下修改：在android{ ... }里面新增：（id 根据你自己的需要设置是否可以同时在一个手机上运行多个自己的app)
```java  
productFlavors {
    myrelease {
        applicationId 'myrelease.apitest.nht.com.multiapi'
        versionName '1.0-release'
    }
    mydebug {
        applicationId 'mydebug.apitest.nht.com.multiapi'
        versionName '1.0-debug'
    }
}
```

结果：
   
![image](https://github.com/AlwaysBeMySelf/MultiApi/raw/master/picture/result_1.png)

![image](https://github.com/AlwaysBeMySelf/MultiApi/raw/master/picture/result_2.png)
![image](https://github.com/AlwaysBeMySelf/MultiApi/raw/master/picture/result_3.png)
