(def fib-seq
  ((fn fib [a b] 
    (lazy-seq (cons a (fib b (+ a b)))))
  0 1))

(println
(reduce + 
  (filter (fn [x]  (even? x)) 
    (take-while #(< % 4000000) fib-seq))))
