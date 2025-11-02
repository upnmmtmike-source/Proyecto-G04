# Guía de Uso de Git

## Comandos Básicos

### Inicializar un repositorio
```bash
git init
```

### Ver el estado de los archivos
```bash
git status
```

### Agregar archivos al staging area
```bash
git add nombre_archivo.txt
git add .                    # Agregar todos los archivos
```

### Hacer commit (guardar cambios)
```bash
git commit -m "Mensaje descriptivo del cambio"
```

## Trabajo con Ramas (Branches)

### Ver las ramas existentes
```bash
git branch
```

### Crear una nueva rama
```bash
git branch nombre_rama
```

### Cambiar de rama
```bash
git checkout nombre_rama
```

### Crear y cambiar a una nueva rama (en un solo comando)
```bash
git checkout -b nombre_rama
```

### Fusionar (merge) una rama
```bash
# Primero cambiar a la rama destino
git checkout main

# Luego fusionar
git merge nombre_rama
```

## Trabajo con Repositorios Remotos

### Clonar un repositorio
```bash
git clone url_del_repositorio
```

### Ver repositorios remotos
```bash
git remote -v
```

### Subir cambios al repositorio remoto
```bash
git push origin nombre_rama
```

### Descargar cambios del repositorio remoto
```bash
git pull origin nombre_rama
```

## Ver Historial

### Ver historial de commits
```bash
git log
git log --oneline           # Versión resumida
git log --graph --oneline   # Con gráfico visual
```

## Ejemplo Práctico

1. Crear una rama nueva:
```bash
   git checkout -b mi_feature
```

2. Hacer cambios y guardarlos:
```bash
   git add .
   git commit -m "Agregué nueva funcionalidad"
```

3. Volver a main y fusionar:
```bash
   git checkout main
   git merge mi_feature
```

4. Subir cambios:
```bash
   git push origin main
```

## Notas

- Siempre hacer commit antes de cambiar de rama
- Usar mensajes descriptivos en los commits
- Hacer pull antes de push para evitar conflictos