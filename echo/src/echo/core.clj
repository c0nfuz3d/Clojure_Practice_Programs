(ns echo.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
(def input "")
(while (not= input "quit") (println "echo: "))
