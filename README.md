# WebPOS

The demo shows a simple POS system in MVC architecture, which replaces the shell interface in aw02 with a pos web ui (https://github.com/bshbsh404/simple-pos-ui
).

![](screenshot.png)

To run

```shell
mvn clean spring-boot:run
```

Currently, it just lists the products for sale with a cart with one item (just for demonstration). 

Please read the tutorial at  https://www.baeldung.com/spring-boot-crud-thymeleaf and make the POS system robust and fully functional. You can also refer to other articles, for instance https://www.baeldung.com/tag/thymeleaf/ .



And please elaborate your understanding in MVC architecture via this homework in your README.md.

—————————————————————————————————————————————————————————————

MVC架构将一个应用程序分成三个主要的逻辑组件model、view和controller

model：包括所有的数据和它的相关逻辑

- model组件存储数据和它的相关逻辑。它表示在控制器组件或任何其他相关业务逻辑之间传输的数据。

view：用于向用户展示数据或处理用户互动

- view从model数据中收集的数据创建，要求model提供互动信息，以便它向用户呈现输出。

controller：是model和view组件之间的一个接口

- controller是应用程序中处理用户交互的部分。解释来自用户的输入，通知model和view做适当的改变。
- controller向model发送命令以更新其状态（例如，保存一个特定的商品）。controller还向其相关的view发送命令，以改变view的表现形式（例如下一页等）。
