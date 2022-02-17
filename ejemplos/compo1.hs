sumar:: (Int -> Int) -> Int
sumar x y = x + y

duplicar:: (Int) -> Int
duplicar x = x * 2

-- En Haskell hay dosmaneras de componer estas funciones
sumarYDuplicar :: Int -> Int -> Int
sumarYDuplicar x y = duplicar (sumar x y)

sumarYDuplicar :: Int -> Int -> Int
sumarYDuplicar2 = duplicar . sumar
