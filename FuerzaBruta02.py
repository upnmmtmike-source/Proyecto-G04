class FuerzaBruta:
    def __init__(self):
        self.T = input("Ingrese un texto: ")
        self.P = input("Ingrese un patrón: ")
        self.n = len(self.T)
        self.m = len(self.P)
    
    def fuerza_bruta(self):
        # i=0,1,2,...,n-m
        for i in range(self.n - self.m + 1):
            j = 0
            while j < self.m and self.P[j] == self.T[i + j]:
                j = j + 1
            
            if j == self.m:
                return i
        
        return -1
    
    def salida(self):
        pos = self.fuerza_bruta()
        if pos != -1:
            print("La subcadena ", self.P, " se encuentra en la posición [", pos, "]")
        else:
            print("La subcadena ", self.P, " NO se encuentra en el Texto")

# Invocación de métodos:
x = FuerzaBruta()
x.salida()

# Mike