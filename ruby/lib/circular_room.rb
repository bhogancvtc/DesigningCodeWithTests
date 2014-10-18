class CircularRoom
  def initialize(radius)
    @radius = radius
  end

  def area
    @radius * @radius * 3.14159
  end
end
