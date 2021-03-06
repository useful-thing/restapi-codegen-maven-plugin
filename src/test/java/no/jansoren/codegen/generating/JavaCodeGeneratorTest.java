package no.jansoren.codegen.generating;

import no.jansoren.codegen.scanning.ScannedClass;
import no.jansoren.codegen.testdata.ScannedClassTestData;
import org.junit.Test;

import java.util.List;

public class JavaCodeGeneratorTest {

    @Test
    public void testGenerateJavaCode() {
        String generatedJavaCodeFolder = "src/test/java";
        String generatedJavaCodePackage = "com.example.helloworld";
        List<ScannedClass> scannedClasses = ScannedClassTestData.createScannedClasses();
        String rootHost = "https://localhost:1234";
        JavaCodeGenerator.generate(scannedClasses, generatedJavaCodeFolder, generatedJavaCodePackage, rootHost);
    }
}
