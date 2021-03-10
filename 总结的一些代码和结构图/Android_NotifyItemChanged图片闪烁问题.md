notifyItemChanged用于在Adapter里更新局部页面，会调用OnBindViewHolder()
也可以用notifydatasetchanged()全局更新

Adapter.notifyItemChanged(position,1);
playload等于1时就能解决了（Stackoverflow里查的野方法，具体原因有待更新）
