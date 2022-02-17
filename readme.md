# Composición transversal: entre música, matemáticas, progamación y ecología

Código y técnica desde mi problemática creativa

# Sobre mi

- Filósofo, compositor, programador
- Interesado en teoría del caos y ecología/permacultura - Sistemas complejos metaestables: fractalidad, autogeneratividad, autodiferenciación, autosimilitud, recrusividad, procesualidad
- Interés secundario por las matemáticas, los procedimientos algorítmicos, la microtonalidad y el tiempo/rítmo
- Desarrollo de varias librerías y proyectos de programación creativa en código abierto
  - [Nanc-in-a-Can](https://github.com/nanc-in-a-can/canon-generator) (con Alejandro Franco Briones)
  - [FluentCan](https://github.com/nanc-in-a-can/fluent-can) [(demo)](https://www.youtube.com/watch?v=GaApGM8byKg)
  - [erv](https://github.com/diegovdc/erv) [(demo)](https://www.youtube.com/watch?v=w2LO5SyieY8)
  - [time-tiem](https://github.com/diegovdc/time-tiem) [(demo)](https://www.youtube.com/watch?v=4LrjMKzQs5o)
  - [Camposónico](https://www.camposonico.net/) [A Palestina (documental livecodeado)](https://www.youtube.com/watch?v=4LrjMKzQs5o)
- Prefiero más el proceso que "la obra". Las obras son sólo momentos de un proceso.

## Introducción

- La composición como un concepto transversal
- Algoritmos y sistemas dentro y fuera de la computación. Como "poetizan" en mi los algoritmos y los sistemas, su influencia en el desarrollo de mis procesos creativos, y mis elección.
  - Papel estructurador en diferentes escalas y modo de ser (presencia estricta, presencia metafórico)
- Secundariamente, los graphos como estructuras algorítmicas sumamente interesantes para mi

## Problemas e intereses

- ¿Cómo funciona el pensamiento? - Filosofía/ontología
  - Noción amplia del pensamiento: sentir, imaginar, crear, percibir, razonar, etc........
    - Construcción del mundo
  - Vida de las ideas
    - Cómo se componen entre ellas para generar sentido(s) (sentido y sensación, misma raíz) [(1)](https://echoic.space/blog/2019-04-28_recuento-taller-abierto-2_9-con-milo-tamez/#los-grafos-como-representaci-n-de-ideas)
    - La música como un vector para la explorar cómo funciona el pensamiento
      - O más específicamente, como un campo de pruebas (experimentación y demostración)

## Teoría

### Composición

- Poner con o junto: **relación**. Componer es relacionar exponiendo las cualidades emergentes de los elementos relacionados.
- Pensar entendido como componer: poner ideas unas junto a otras de determinadas maneras o mediante determinadas funciones
  - (e.g. sintaxis, comparación, contradicción, etc.)
  - El sentido emerge de una composición de este tipo.
    - Collage como ejemplo paradigmático
    - Los colores de la armonía (e.g. mayor y menor) no son propiedades de las notas en sí sino de las relaciones (interválicas y rítmicas) que se producen entre ellas en un momento dado

#### Composición en música: poner sonidos unos junto a otros

- Ocurre en diferentes escalas - combinar/componer ideas genera nuevas ideas
  - En términos tradicionales (pero no exhaustivos):
    - sonido individual -> célula motívica -> frase -> tema -> seccion -> ...
    - Hasta cierto punto todos los niveles pueden concebirse como ideas músicales compuestas de otras ideas músicales
- En mi problemática: ¿Cómo hacer uso de la capacidad composicional del pensamiento?
  - Importancia de la colaboración y la diversidad
  - La improvisación
  - Generación y desarollo de ideas
  - **Una de mis búsquedas actuales**: Crear una música hecha de músicas.
    - Donde además cada música ("pieza musical") está viva e interactúa con las otras músicas de manera emergente
    - Concebir músicas como co-existiendo en un mundo, no como objetos bien definidos y separados unos de otros (objetos abstractos)
    - En mi obra: [{Videcoic One}](https://echoic.space/music/videcoic-one/) y [Hábitat](https://echoic.space/blog/2019-04-28_recuento-taller-abierto-2_9-con-milo-tamez/)
    - Ejemplos similares: Son Jarocho donde un Son no tiene un número finito de versos, sino que siempre está abierto a la inclusión de nuevos versos, y donde los eventos musicales no están completamente predeterminados, hay mucha improvisación, pero existen dentro de un cierto marco (flexible) de sentido.

#### Composición de funciones (matemáticas y programación)

![Composición de Funciones - fuente WikiPedia](https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/Example_for_a_composition_of_two_functions.svg/1280px-Example_for_a_composition_of_two_functions.svg.png)

- Viene de la _Teoría de Categorías_ y el _Cálculo Lambda_.
- Producir una función que realiza una operación extensa a partir de funciónes que realizan operación pequeñas (como una tubería o tracto de procesos - e.g. tracto intestinal - ).
  - Resolver un problema difícil al descomponerlo en problemas más pequeños que pueden ser resueltos fácilmente, y luego recomponer estas soluciones de modo que produzcan la solución del problema original.
  - Secuenciar funciones de modo que la salida o resultado de una (ouput) aporta los argumentos de entrada de la siguiente (input)

```py
# entrada: dos números, salida un número
def sumar (x, y):
  return x + y #

# entrada: un número, salida un número
def duplicar (x):
  return x * 2

def sumarYDuplicar (x, y):
  return duplicar(sumar(x, y))
```

- La clave para componer funciones es hacer que el _tipo de dato_ (numero, cadena, booleano, lista de números...) de salida de una función sea el tipo de dato de entrada de la siguiente
- Modularidad: programas que se componen con otros programas
- Al igual que en la música, la composición en programación ocurre en diversas escalas
- En terminos no estrictos: función -> módulo -> librería -> programa -> aplicación...
  - En realidad la distinción no es necesariamente tan clara, pero espero que lo anterior haga sentido
  - Hasta cierto punto todos los niveles pueden concebirse como funciones compuestas de otras funciones
- Importante: para mi un sinónimo de función es _proceso_

### Composición de funciones en permacultura

Toby Hemenway dice en _Gaia's Garden_:

> Each element performs multiple functions. Choose and place each element in a design to perform as many functions as possible. Beneficial connections between diverse components create a stable whole. Stack elements in both space and time.
> Each function is supported by multiple elements. Use multiple methods to achieve important functions and to create synergies. Redundancy protects when one or more elements fail.

- Conexión - Relación - Composición
- Ecología
  - Todo está conectado
  - Redes
  - e.g. Clima
    - Teoría del caos (efecto mariposa)
      - Lorentz (funciones diferenciales) - recursividad

#### Síntesis filosófico-musical-matemática (en mi problemática)

- Para mi hay una analogía que va de cabo a cabo entre las producción de ideas/emociones/sentidos en el pensamiento, la componibilidad de entidades sonoras en música y la composición matemática de funciones

#### Algunos postulados

1. El pensamiento humano es el sistema de composición más complejo al que tenemos acceso (al menos en condiciones ordinarias -i.e. fuera de la experiencia mística -).
2. El sistema composicional más grande de todos es la naturaleza. El pensamiento (incluyendo la música, la matemática, etc.)es parte la naturaleza - musica, matemática e ideas son algunos de los elementos que la componen).
3. Diferencia, relación y proceso (ser como verbo) son primeros respecto de la identidad, el objeto en sí mismo y la entidad (ser estático o el ser como sustantivo ).
4. Una música de músicas vivas y en evolución (mundo/hábitat musical) es posible si hacemos uso de las capacidades composionales del pensamiento, y si concebimos a la música como proceso y no como un objeto estático, completo o definido. Esto es aun más factible y fácil de lograr si seguimos y observamos los modos de ser y componer de la naturaleza.
5. La matemática y la programación ofrecen herramientas para trabajar con la componibilidad de ideas. Herramientas efectivas (practicas y aplicables: teoremas, lenguajes, programas) así como metafóricas (conceptos que podemos ingresar al sistema composicional del pensamiento para poner en juego en integrar con otros elementos en la imaginación).
6. La programación expresa ideas matemática-electrónicamente objetivas - a las que es posible también acomplar metáforas, es decir, otras ideas del pensamiento. (Puente entre la técnica y la creatividad, la matemática y la praxis).
7. No se debe confundir objetividad (e.g. de la programación) con verdad. La objetividad es reducción; la naturaleza es primordial.

## Práxis

### Hábitat

- Proceso-obra abierta desarrollada junto con [Milo Tamez](https://www.milotamez.com.mx/)
- Inspirada y basada en el funcionamiento de los ecosistemas desde una función permacultural/ecológica
  - Exploración de los ecosistemas en múltiples escalas: micro (subatómica) -> macro (cósmica)
- Proceso evolutivo de los materiales: transformación y retransformación
  - Ejecución de la partitura -> grabación -> procesamiento digital (Audacity) <-> procesamiento supercollider <-> integración composicional en Reaper
  - Ejemplos:
    - Grabación original: Grafos [Hay un Fuego y Amanecer](https://echoic.space/music/fuego_amanecer/)
    - Procesamiento 1 (Supercollider): [Árbol](https://echoic.space/music/arbol-habitat/)
    - Procesamiento 2 (Supercollider post Audacity): [Fuego](https://echoic.space/music/fuego/)
    - Expansión temporal (Supercollider post Audácity post Supercollider post Audacity): [Hábitat Expandido #3 (Toro y Campos Electromagéticos)](https://echoic.space/music/habitat-expandido-32-a-34/)
- Partitura doble:
  - Graphos - los graphos son muy fáciles de componer unos con otros
  - [Linea de tiempo](https://habitat-form.netlify.app/) - la rejilla temporal es un Momento de Símetria secundario (ver más adelante)

### Caminos de tiempo

[Caminos de tiempo](https://github.com/diegovdc/tiempaminos) es un repositorio que funciona como un taller de código. Espacio/Proceso de creación dónde herramientas y obras están todas a la mano.

#### Estructura

- Escrito principalmente en Clojure
  - Basado en técnicas de programación funcional
    - Composición, modularidad, simplicidad
      - Hacer uso de la simplicidad para generar y trabajar con la complejidad
        - Rich Hickey [Simple Made Easy](https://www.youtube.com/watch?v=SxdOUGdseq4)
- Tres _librerías_ externas básicas: [erv](https://github.com/diegovdc/erv) (armonía microtonal), [time-tiem](https://github.com/diegovdc/time-tiem) (rítmo y patrones) y [overtone](https://github.com/overtone/overtone) (síntesis, conexión con Supercollider).
  - Desarrollo y mantengo las primeras dos, y tengo una versión con mis propias modificaciones de la última
  - Ventajas de mantener las librerías en el exterior
    - Clojure hace muy sencillo trabajar con todo al mismo tiempo
  - `erv`
    - Basada en las teorías de la afinación de Erv Wilson (teórico mexico-norteamericano). [Wilson Archive](http://www.anaphoria.com/wilson.html)
    - [Moment of Symmetry (MOS)](http://www.anaphoria.com/mos.pdf) - generación algoritmica de escalas cuya estructura es o se aproxima a la de escalas de distintas partes del mundo. También producen rítmos euclidianos.
    - Permutaciones Marwa - Permutaciones de MOS. Algorítmo que produce las permutaciones de los Ragas o `Thats` del norte de la India.
    - CPS (Conjunto de combinación de productos) [(1)](http://www.anaphoria.com/hexany.pdf), [(2)](http://www.anaphoria.com/dal.pdf)
    - [Harramienta web basada en `erv`](https://wilson-tunings.echoic.space/)
    - Ejemplo: La implementación de los CPS es un buen ejemplo de composición de funciones

```clj
(defn make
  "Genera una escala CPS"
  [size factors & {:keys [period norm-fac] :or {period 2 norm-fac 1}}]
  (->> factors
       (->cps size)
       set->maps
       (bound-ratio period norm-fac)
       (maps->data :bounded-ratio)
       (+meta size factors norm-fac)))
```

- Diferentes áreas: composiciones, area de bocetos y experimentación, sets de live coding, herramientas
  - Herramientas principales:
    - Conexión MIDI
      - Supercollider <-> DAW
      - Interfaz MIDI -> Supercollider
      - escalas de `erv` -> MPE (MIDI Polyphonic Expression) - microtonalidad dinámica con sintetizadores externos ([Surge](https://surge-synthesizer.github.io/) o [Vital](https://vital.audio/))
    - OSC
      - Clojure <-> Supercollider
      - Clojure -> Reaper
    - Matemáticas
      - Curvas de Bezier
  - Composiciones
    - [Garden/Earth](https://youtu.be/X4r6_j2qDd8)
      - Varias piezas en proceso para live coder, flautista en torno a la escala [Eikosany](http://www.anaphoria.com/eikosanystructures.pdf)
      - Sintesís (SC y Surge)
      - Concepto: cultivar ideas (microcomposiciones) y desarrollarlas gradualmente hasta que se integren de diversas maneras
        - Estructura interna (hasta el momento)
        - 5 Microcomposciones
        - Sampler en tiempo real (programable y controlable mediante live coding), incluye analizardor de frecuencia para clasificar en tiempo real las muestras
        - Capacidad para genera partituras: digitaciones de la flauta junto indicaciones de caracter, secuenciamiento de procesos de síntesis, interacción con Reaper, etc.
        - Varias herramientas trabajar y análizar los CPS/Eikosany
        - Funciones para practicar la afinación de la Eikosany con la flauta
          - Genera sonidos de referencia junto con las digitaciones correspondientes
        - Archivo de inicialización. Para levantar el sistema rápidamente

## Recursos

-- Programación
Bartoz Milewski - Teoría de Categorías para programadores (curso en video) https://www.youtube.com/watch?v=I8LbkfSSR58&list=PLbgaMIhjbmEnaH_LTkxLI7FMa2HsnawM_
Bartoz Milewski - Teoría de Categorías para programadores (texto en linea) https://bartoszmilewski.com/2014/10/28/category-theory-for-programmers-the-preface/
Dr. Boolean - Guía para la programación funcional (Javascript) https://github.com/MostlyAdequate/mostly-adequate-guide-es
Learn You a Haskell for Great Good (Haskell) http://learnyouahaskell.com/
Clojure for the Brave and True (Clojure) https://www.braveclojure.com/
Rich Hickey - Simple Made Easy (Conferencia) https://www.youtube.com/watch?v=SxdOUGdseq4
Rich Hickey - Design, Composition, Performance (Conferencia) https://www.youtube.com/watch?v=MCZ3YgeEUPg
Scott Walshin - Functional Design Patterns (Conferencia) https://www.youtube.com/watch?v=gxf9V_GYDdc

-- Filosofía
Gilles Deleuze y Felix Guattari - (libro) Rizoma
Gilles Deleuze - (libro) Mil Mesetas - incluye Rizoma
Alfred North Whitehead - (libro) Proceso y Realidad

-- Permacultura
Toby Hemenway - (libro) Gaia's Garden
Geoff Lawton - Integrated System Design (Video) https://www.youtube.com/watch?v=waMkYsuk1eE
