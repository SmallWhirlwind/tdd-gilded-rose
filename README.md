# TDD @Gilded Rose


## 开发环境
 - JDK1.8+
 
## 业务需求

"镶金玫瑰"！这是一家魔兽世界里的小商店。出售的商品也都是高质量的。但不妙的是，随着商品逐渐接近保质期，它们的质量也不断下滑。我们用一个IT系统来更新库存信息。

首先，简单介绍一下我们的系统：

- 所有商品都有一个`SellIn`值，这是商品距离过期的天数，最好在这么多天之内卖掉
- 所有商品都有一个`Quality`值，代表商品的价值
- 商品的`SellIn`值和`Quality`值，它们每天会发生变化，但是会有特例


商品的价格规则说明如下：

- 商品的价值永远不会小于0，也永远不会超过50
- 一旦过了保质期，`Quality`就以双倍的速度下滑
- 陈年干酪（`Aged Brie`）是一种特殊的商品，放得越久，价值反而越高
- 萨弗拉斯（`Sulfuras`）是一种传奇商品，没有保质期的概念，价值也不会下滑
- 后台门票（`Backstage pass`）和陈年干酪（`Aged Brie`）有相似之处：
	- 越接近演出日，商品的价值反而上升
	- 在演出前10天，价值每天上升2点
	- 演出前5天，价值每天上升3点
	- 一旦过了演出日，价值就马上变成0

1. Given CommonProduct,  SellIn为1, Quality为40, When 过了一天, Then SellIn为0, Quality为39  
2. Given CommonProduct,  SellIn为0,  Quality为40, When 过了一天, Then SellIn为-1, Quality为38  
3. Given CommonProduct,  SellIn为-1, Quality为40, When 过了一天, Then SellIn为-2, Quality为38
---
1. Given Aged Brie,      SellIn为30, Quality为40, When 过了一天, Then SellIn为29, Quality为41
2. Given Aged Brie,      SellIn为30, Quality为50, When 过了一天, Then SellIn为29, Quality为50
---
1. Given Sulfuras,                   Quality为40, When 过了一天,                 Quality为40
---
1. Given Backstage Pass, SellIn为11, Quality为20, When 过了一天, Then SellIn 为10, Quality为21
2. Given Backstage Pass, SellIn为11, Quality为50, When 过了一天, Then SellIn 为10, Quality为50
3. Given Backstage Pass, SellIn为10, Quality为20, When 过了一天, Then SellIn 为9,  Quality为22
4. Given Backstage Pass, SellIn为6,  Quality为20, When 过了一天, Then SellIn 为5,  Quality为22
5. Given Backstage Pass, SellIn为5,  Quality为20, When 过了一天, Then SellIn 为4,  Quality为23
6. Given Backstage Pass, SellIn为1,  Quality为20, When 过了一天, Then SellIn 为0,  Quality为23
7. Given Backstage Pass, SellIn为0,  Quality为20, When 过了一天, Then SellIn 为-1, Quality为0
