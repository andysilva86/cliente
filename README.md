# cliente
API cliente para acesso a PunkAPI https://punkapi.com/

# Endpoints:

# Listar todas as cervejas
http://localhost:8080/cerva
Metodo GET

# Listar cerveja especifica
http://localhost:8080/cerva/{id}
Metodo Get
id = numerico
Ex:http://localhost:8080/cerva/1

# Alterar descricao da cerveja especifica
http://localhost:8080/cerva/descricao/{id}
Metodo PATCH
id = numerico
Ex:http://localhost:8080/cerva/descricao/1

Descricao via Body: {"descricao":"Descricao enviada"}

API cliente v1.0
