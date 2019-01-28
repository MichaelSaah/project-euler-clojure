(def ^:const the-number 600851475143)

(defn is-prime? [n]
  (empty? (filter #(= 0 (mod n %)) (range 2 n))))

(defn is-divisor? [n k]
  (integer? (/ n k)))

(defn div-seq [n]
  (filter (partial is-divisor? n)
          (range (int (Math/sqrt n)) 1 -1)))

(defn largest-prime-divisor [n]
  (first (filter is-prime? (div-seq n))))

(println (largest-prime-divisor the-number))
