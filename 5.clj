(defn gcd [a b]
  (if (zero? b)
    a
    (recur b (mod a b))))

(defn lcm [a b]
  (/ (* a b) (gcd a b)))

(defn lcm-vec [v]
  (reduce lcm v))

(println (lcm-vec (range 1 20)))
