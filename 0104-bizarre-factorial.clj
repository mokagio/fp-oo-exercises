; Using range and apply, implement a bizarre version of factorial that uses neither iteration nor recursion.

(def factorial (fn [n] (apply * (range 1 (+ 1 n)))))
