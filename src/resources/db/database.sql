CREATE TABLE IF NOT EXISTS Categorias(
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  nombre VARCHAR(30)
);

CREATE TABLE IF NOT EXISTS Palabras(
  nombre VARCHAR(30) PRIMARY KEY,
  imagen VARCHAR(30),
  categoriaId INTEGER REFERENCES Categorias
);

CREATE TABLE IF NOT EXISTS Niveles(
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  nombre VARCHAR(30),
  grado INTEGER
);

CREATE TABLE IF NOT EXISTS PalabrasNivel(
  palabra VARCHAR(30) REFERENCES Palabras,
  nivel INTEGER REFERENCES  Niveles,
  PRIMARY KEY (palabra, nivel)
);

CREATE TABLE IF NOT EXISTS CategoriasNivel(
  categoria INTEGER REFERENCES Categorias,
  nivel INTEGER REFERENCES Niveles,
  PRIMARY KEY(categoria,nivel)
);