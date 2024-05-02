package org.example;

import java.io.IOException;
import java.io.PrintWriter;
import jdepend.swingui.JDepend;

public class SwingUiMain {
  public static void main(String[] args) throws IOException {
    JDepend jDependUI = new JDepend();
    jDependUI.addDirectory("D:\\SA\\Library-Assistant-master");
    jDependUI.analyze();
    System.out.println("Done !!");

    jdepend.xmlui.JDepend jDependXML = new jdepend.xmlui.JDepend(new PrintWriter("./Lab3_TheMainSequence/src/main/resources/report.xml"));
    jDependXML.addDirectory("D:\\SA\\Library-Assistant-master");
    jDependXML.analyze();
    System.out.println("Done!!");
    autoExplorer();
  }

  public static void autoExplorer() throws IOException {
    String targetDir = "D:\\SA\\BuiTriThuc_20088361_Labs_SA\\Lab3_TheMainSequence-npm\\jdepend-ui";
    String explorerCommand = "npm run jdepend-ui D:\\SA\\BuiTriThuc_20088361_Labs_SA\\Lab3_TheMainSequence\\src\\main\\resources\\report.xml com";
    Runtime runtime = Runtime.getRuntime();
    runtime.exec("cmd /c start cmd.exe /K \"cd " + targetDir + " && " + explorerCommand + " && start index.html" );
  }
}
