# Laboratorio `06`


## To do

- ¿En qué consiste el patrón de diseño Repository?

        El patrón repositorio consiste en separar la lógica que recupera los datos y los asigna a un modelo de entidad de la lógica de negocios que 
        actúa sobre el modelo, esto permite que la lógica de negocios sea independiente del tipo de dato que comprende la capa de origen de datos, 
        en pocas palabras un repositorio media entre el dominio y las capas de mapeo de datos, actuando como una colección de objetos de dominio en memoria.


- ¿Qué es el ViewModel?

        Expone el estado a la IU y encapsula la lógica empresarial relacionada. Su principal ventaja es que almacena en caché el estado y 
        lo conserva durante los cambios de configuración. Esto significa que la IU no tiene que recuperar datos cuando navegas entre a
        ctividades o si sigues cambios de configuración, como cuando rotas la pantalla.