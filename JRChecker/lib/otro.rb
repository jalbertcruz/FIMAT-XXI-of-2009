

r = Robot.new( gui.context, 1, 2, Direccion::Este )
[ 'Robot', 1, 2, Direccion::Este ]

p = Puerta.new( gui.context, 7, 8 )
gui.robot  = r
gui.puerta = p

for i in (1..6)
  gui.setLadrillo i, 8
end

for i in (1..3)
  gui.setLadrillo i, 5
end

for i in (8..12)
  gui.setLadrillo i, 8
end
