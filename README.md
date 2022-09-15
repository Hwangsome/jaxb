# jaxb
## 简介
JAXB（Java Architecture for XML Binding) 是一个业界的标准，是一项可以根据XML Schema产生Java类的技术。 该过程中，JAXB也提供了将XML实例文档反向生成Java对象树的方法，并能将Java对象树的内容重新写到XML实例文档。 从另一方面来讲，JAXB提供了快速而简便的方法将XML模式绑定到Java表示，从而使得Java开发者在Java应用程序中能方便地结合XML数据和处理函数。
首先，我们将展示如何将 Java 对象转换为 XML，反之亦然。 然后我们将专注于使用 JAXB-2 Maven 插件从 XML 模式生成 Java 类，反之亦然。

## Marshalling(编组) 将 Java 对象转换为 XML
编组使客户端应用程序能够将 JAXB 派生的 Java 对象树转换为 XML 数据。 默认情况下，Marshaller在生成 XML 数据时使用 UTF-8 编码。接下来，我们将从 Java 对象生成 XML 文件。