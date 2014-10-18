class PaintCalculator
  PAINT_FOR_CEILING = 350

  def initialize(room)
    @room = room
  end

  
  def gallons_of_paint_for_ceiling
    result = calculate_area / PAINT_FOR_CEILING
    result.ceil
  end

  private
    def calculate_area
      @room.area
    end

end
