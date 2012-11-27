## Usage

0.Modify your checkstyle.xml as shown below

```xml
<?xml version="1.0"?>
<!DOCTYPE module PUBLIC "-//Puppy Crawl//DTD Check Configuration 1.3//EN"
          "http://www.puppycrawl.com/dtds/configuration_1_3.dtd">
<module name="Checker">
  <module name="TreeWalker">
    ...
    <module name="com.github.shyiko.checkstyle.nonstandard.NumberOfConsecutiveBlankLinesCheck">
        <property name="maximum" value="1"/><!-- default value -->
    </module>
  </module>
</module>
```

1.(for Maven user only) Update dependencies section of maven-checkstyle-plugin

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-checkstyle-plugin</artifactId>
    <version>2.9.1</version>
    ...
    <dependencies>
        <dependency>
            <groupId>com.github.shyiko</groupId>
            <artifactId>checkstyle-nonstandard</artifactId>
            <version>0.1.0</version>
        </dependency>
    </dependencies>
</plugin>
```
