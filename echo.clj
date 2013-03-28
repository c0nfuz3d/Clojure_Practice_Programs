(print "echo by James Nakano")
(def user_input "")

(let [user_input (read-line)]
  (if(= "quit")
    (println "quitting...")))

;(while (not(= user_input "quit")) (user_input (read-line) (print user_input)))

(print "quitting...")