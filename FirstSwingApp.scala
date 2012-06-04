package com.mayera.portfolio

import scala.swing._
object FirstSwingApp extends SimpleGUIApplication {
def top = new MainFrame {
title = "First Swing App"
contents = new Button {
text = "Click me"
}
}
}