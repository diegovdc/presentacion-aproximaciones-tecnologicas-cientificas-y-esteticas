(ns ejemplos.compo1)

(defn sumar [x y] (+ x y))
(defn duplicar [x] (* x 2))

;; En clojure hay tres maneras de componer estas funciones
(defn sumar-y-duplicar [x y] (duplicar (sumar x y)))
(sumar-y-duplicar 1 2)

(def sumar-y-duplicar2 (comp duplicar sumar))
(sumar-y-duplicar2 1 2)

(defn sumar-y-duplicar3 [x y] (-> (sumar x y) duplicar ))
(sumar-y-duplicar3 1 2)
