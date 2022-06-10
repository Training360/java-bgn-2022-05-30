package email;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.util.List;
import java.util.Map;

public class EmailTemplate {

    public static void main(String[] args) {
        var engine = new TemplateEngine();
        var resolver = new ClassLoaderTemplateResolver();
        resolver.setPrefix("/templates/");
        resolver.setSuffix(".txt");
        resolver.setTemplateMode(TemplateMode.TEXT);
        engine.setTemplateResolver(resolver);

        var context = new Context();
        context.setVariables(
                Map.of("name", "John Doe", "salary", 100_000, "skills", List.of("Java", "Python"))
        );
        var text = engine.process("email-hu", context);
        System.out.println(text);
    }
}
