package fr.pe.IHMGestionDesCles.controller;

import com.samskivert.mustache.Mustache;
import org.springframework.boot.autoconfigure.mustache.MustacheAutoConfiguration;
import org.springframework.boot.autoconfigure.mustache.MustacheProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
@EnableConfigurationProperties({MustacheProperties.class})
public class LayoutAutoConfiguration extends MustacheAutoConfiguration {

    /**
     * Constructor
     *
     * @param mustache mustache
     * @param environment environment
     * @param applicationContext applicationContext
     */
    public LayoutAutoConfiguration(MustacheProperties mustache, Environment environment, ApplicationContext applicationContext) {
        super(mustache, environment, applicationContext);
    }

    /**
     * Personnalisation de la configuration du starter Mustache pour gérer les valeurs nulles
     *
     * @param mustacheTemplateLoader mustacheTemplateLoader
     * @return return super.mustacheCompiler(mustacheTemplateLoader).defaultValue("")
     */
    @Override
    public Mustache.Compiler mustacheCompiler(Mustache.TemplateLoader mustacheTemplateLoader) {
        return super.mustacheCompiler(mustacheTemplateLoader).defaultValue("");
    }
}