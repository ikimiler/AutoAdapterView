
###安卓布局自动适配---另一种姿势

#### AutoAdapterButton
#### AutoAdapterTextView
#### AutoAdapterImageView
#### AutoAdapterLinearLayout
#### AutoAdapterFrameLayout
#### AutoAdapterRelativeLayout
#### AutoAdapterTableLayout

不够的，请自行扩展


xmlns:auto="http://schemas.android.com/apk/res-auto" 命名空间 eclipse用户请把res-auto 换为res/xxx 您的应用程序包名

ration ：宽高比

anchor：宽度，意思是，根据宽度去自动计算该控件的高度，当然反之，也可以根据高度去自动计算控件的宽度。这里注意，根据什么(宽度或者高度),该值一定要有明确值，不能wrap_content

###使用方法：

     <com.example.myapplication.AutoAdapterImageView
      auto:ration="0.29"  // 比率
      auto:anchor="width" //根据宽 决定高
      android:layout_width="match_parent" // 宽必须是一个固定值  
      android:layout_height="wrap_content"
      android:background="#ff0000"
     ></com.example.myapplication.AutoAdapterImageView>

     <com.example.myapplication.AutoAdapterImageView
      auto:ration="0.29"  // 比率
      auto:anchor="height" //根据高 决定宽
      android:layout_width="wrap_content" 
      android:layout_height="match_parent"// 高必须是一个固定值
      android:background="#ff0000"
     ></com.example.myapplication.AutoAdapterImageView>

#### csdn 博文 http://blog.csdn.net/qq_28268507/article/details/53319104
#### 简书  博文 http://www.jianshu.com/p/54fcfe9fca0d
