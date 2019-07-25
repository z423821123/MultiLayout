# MultiLayout
Recyclerview多布局的实现  
继承ViewHolder,重写onCreateViewHolder和onBindViewhoder逻辑  
重写Adapter中onCreateViewHolder方法   
根据传入不同type,在工厂中生产不同的viewholder,以此来实现recyclerview的多布局  
![多布局](https://github.com/z423821123/Image/blob/master/MultiLayout.png)
第一个布局是一个水平排列的recyclerview  
第二个布局是一个简单的水平布局  
第三个布局是一个竖直排列的recyclerview  
