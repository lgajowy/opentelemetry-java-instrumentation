package com.example.javaagent.instrumentation;

import static java.util.Collections.singletonList;

import com.google.auto.service.AutoService;
import io.opentelemetry.javaagent.extension.instrumentation.InstrumentationModule;
import io.opentelemetry.javaagent.extension.instrumentation.TypeInstrumentation;
import io.opentelemetry.javaagent.extension.matcher.AgentElementMatchers;
import java.util.List;
import net.bytebuddy.matcher.ElementMatcher;

@AutoService(InstrumentationModule.class)
public final class DemoAkkaHttpInstrumentationModule extends InstrumentationModule {
  public DemoAkkaHttpInstrumentationModule() {
    super("akka-http", "akka-http");
  }

   @Override
  public List<TypeInstrumentation> typeInstrumentations() {
    return singletonList(new DemoAkkaHttpInstrumentation());
  }
}
