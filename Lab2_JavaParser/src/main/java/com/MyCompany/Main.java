package com.MyCompany;

import java.io.File;

public class Main {

  public static void main(String[] args) {
    File root = new File("TestFolderForLab02");
    testDirExplore(root);
    CommonOperations.listMethodCalls(root);
  }

  public static void testDirExplore(File root) {
    new DirExplorer((level, path, file) -> path.endsWith(".java"),
        (level, path, file) -> System.out.println(path)).explore(root);

  }
}