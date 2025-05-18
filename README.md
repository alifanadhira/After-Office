# After-Office

Clone Repo:
Pada folder yang akan menjalankan repository ketik: git clone https://github.com/alifanadhira/After-Office.git

Dependency:
Pada file pom.xml, tambahkan dependency testNG dan rest assured:
<dependencies>
<!-- https://mvnrepository.com/artifact/org.testng/testng -->
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.11.0</version>
            <scope>test</scope>
        </dependency>  
        <!-- https://mvnrepository.com/artifact/io.rest-assured/rest-assured -->
        <dependency>
            <groupId>io.rest-assured</groupId>
            <artifactId>rest-assured</artifactId>
            <version>5.5.1</version>
            <scope>test</scope>
        </dependency>
</dependencies>

Running test:
* Jalankan test Register.java terlebih dahulu
* Lalu jalankan test RestAssuredTask.java
