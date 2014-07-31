
#include Java

include_class "entradasalida.InputOutput"

def ___convertirTipo v
  if v.include? '"'
    return v[1..-2]
  else
    if v.include? '.'
      return v.to_f
    else return v.to_i
    end
  end  
end
