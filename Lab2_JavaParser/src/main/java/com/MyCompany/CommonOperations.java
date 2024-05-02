package com.MyCompany;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.PackageDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.google.common.base.Strings;
import java.io.File;

public class CommonOperations {

  public static void listMethodCalls(File root) {
    new DirExplorer((level, path, file) -> path.endsWith(".java"), (level, path, file) -> {
      System.out.println(path);
      System.out.println(Strings.repeat("=", path.length() + 10));
      checkPackageName(file);
    }).explore(root);
  }

  private static void checkPackageName(File file) {
    try {
      new VoidVisitorAdapter<Object>() {
        @Override
        public void visit(PackageDeclaration n, Object arg) {
          super.visit(n, arg);
          System.out.println(n.getParentNode());
        }
      }.visit(StaticJavaParser.parse(file), null);
    } catch (Exception exception) {
      throw new RuntimeException(exception);
    }
  }
}
