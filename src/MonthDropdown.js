import React from 'react';

const MonthDropdown = ({ selectedMonth, setSelectedMonth }) => {
  const months = [
    'January', 'February', 'March', 'April', 'May', 'June',
    'July', 'August', 'September', 'October', 'November', 'December'
  ];

  const handleChange = (e) => {
    setSelectedMonth(e.target.value);
  };

  return (
    <div className="month-dropdown">
      <label>Select Month: </label>
      <select value={selectedMonth} onChange={handleChange}>
        {months.map((month, index) => (
          <option key={index} value={month}>{month}</option>
        ))}
      </select>
    </div>
  );
};

export default MonthDropdown;
