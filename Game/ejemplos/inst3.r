
def repetir n
  for i in (1..n)
    robot.darPaso
  end
end

robot.girarDerecha

repetir 5

robot.girarIzquierda

for i in 1..2
  robot.darPaso
end
