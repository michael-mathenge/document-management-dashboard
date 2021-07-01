# document-management-dashboard
### <ins>Backend</ins>
1. Java - Spring boot
2. Database - Oracle 12c (optional)

### <ins>Frontend</ins>
1. Thymeleaf

### <ins>Installation Instructions</ins>
1. Create a [Maven](https://maven.apache.org/what-is-maven.html) spring boot application via this link [spring initializr](https://start.spring.io/) add include these dependencies:

        - spring-boot-starter-parent
        - spring-boot-starter-data-jpa
        - spring-boot-starter-thymeleaf
        - spring-boot-starter-web
        - ojdbc8 (or relevant database drivers)
        - spring-boot-configuration-processor
        - lombok
        - spring-boot-starter-tomcat
        - spring-boot-starter-test
      
3. Unzip and open the directory in IDE. (If you did not generate the application from your IDE)
        File -> New Project from existing sources -> navigate to unzipped folder until you get to POM.xml then open that.

4. Navigate to your group package location e.g. (src/main/java/com/mike/<project_name>), `com.mike` - right-click - new - package - add the package name;
        now it will appear like e.g. `com.mike.controllers`. Create the following packages using the above method.
        
        -models
        -controllers
        -repositories
        -services
        
5. Understanding Java Spring MVC logic

      **@Controller** classes serve as C from MVC. Note that the real controller in Spring MVC is DispatcherServlet that will use the specific @Controller class to <ins>handle the URL request</ins>. @Controller classes should only have access to *@Service* classes through interfaces. Similar, *@Service* classes should only have access to other *@Service* classes and for a specific set of *@Repository* classes through interfaces.

      **@Service** classes should serve for your service layer. Here you should put your <ins>business logic</ins>. The service layer is there to provide logic to operate on the data sent to and from the DAO and the client.

      **@Repository** classes should serve for your <ins>data access layer</ins>. Here you should put CRUD logic:Create(insert), Read(select) Update, Delete, .

      **@Service**, **@Repository** and your **@entity** classes will be M from MVC. JSP and other view technologies (e.g. JSP, Thymeleaf e.t.c.) will conform V from MVC.

n/b
The ***@Id*** annotation is inherited from javax.persistence.Id, indicating the member field below is the primary key of current entity. Hence your Hibernate and spring framework as well  can do some reflect works based on this annotation.

The ***@GeneratedValue*** annotation is to configure the way of increment of the specified column(field). For example when using Mysql, you may specify                      auto_increment in the definition of table to make it self-incremental, and then use `@GeneratedValue(strategy = GenerationType.IDENTITY)`

  
### <ins>Understanding Thymeleaf</ins>

Thymeleaf is a **`template engine`**. A  **`template engine`** enables you to use static template files in your application. At runtime, the template engine  
replaces variables in a template file with actual values, and transforms the template into an HTML file sent to the client.  
This approach makes it easier to design an HTML page.



        
        


