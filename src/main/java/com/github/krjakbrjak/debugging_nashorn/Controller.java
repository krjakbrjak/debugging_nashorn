package com.github.krjakbrjak.debugging_nashorn;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.io.File;
import java.io.IOException;

@RestController
public class Controller {
    @Autowired
    private ScriptEngine scriptEngine;

    @GetMapping(path = "hello")
    public String get_hello() throws ScriptException, IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("hello_world.js").getFile());
        String script = FileUtils.readFileToString(file, "UTF-8");
        return scriptEngine.eval(script).toString();
    }
}
